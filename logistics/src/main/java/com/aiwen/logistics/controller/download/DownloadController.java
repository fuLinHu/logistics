package com.aiwen.logistics.controller.download;

import com.aiwen.logistics.pojo.FileManage;
import com.aiwen.logistics.pojo.formTemplateType;
import com.aiwen.logistics.service.FileManageService;
import com.aiwen.logistics.service.FormTemplateTypeService;
import com.mchange.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018/5/5.
 */
@Controller
@RequestMapping("/downloadManage")
public class DownloadController {
    @Autowired
    private FileManageService fileManageService;
    @Autowired
    private FormTemplateTypeService formTemplateTypeService;

    @RequestMapping("/index")
    public ModelAndView toDownloadPage(){
        ModelAndView modelAndView = new ModelAndView("download/downloadPage");
        List<FileManage> list = this.fileManageService.findAll();
        modelAndView.addObject("list",list);
        return modelAndView;
    }

    @RequestMapping("/download")
    public ResponseEntity<byte[]> download( Integer id) throws IOException {
        FileManage  fileManage=this.fileManageService.findById(id);
        File file = new File(fileManage.getFileUrl());
        byte[] body = null;
        InputStream is = new FileInputStream(file);
        body = new byte[is.available()];
        is.read(body);
        HttpHeaders headers = new HttpHeaders();
        String fileName=new String( fileManage.getOldFileName().getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题
        headers.add("Content-Disposition", "attchement;filename=" + fileName);
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
        return entity;
    }

    @RequestMapping("/getFormTemplateType")
    @ResponseBody
    public Map<String,List<String>> getFormTemplateType(String type){
        Map<String,List<String>> resultMap = new HashMap<String, List<String>>();
        List<formTemplateType> list=this.formTemplateTypeService.findList(type);
        List<String> listNames =  new ArrayList<String>();
        List<String> listVals = new ArrayList<String>();
        for (formTemplateType f:list){
            listNames.add(f.getFromTypeName());
            listVals.add(f.getId()+"");
        }
        resultMap.put("names",listNames);
        resultMap.put("namesVal",listVals);
        return resultMap;
    }

    @RequestMapping("/getFileData")
    @ResponseBody
    public Map<String,List<String>> getFileData(String formTemplateTypeId){
        Map<String,List<String>> resultMap = new HashMap<String, List<String>>();
        List<FileManage> list = this.fileManageService.findByFormTemplateTypeId(formTemplateTypeId);
        List<String> listNames = new ArrayList<String>();
        List<String> listVals = new ArrayList<String>();
        for(FileManage f : list){
                listNames.add(f.getFileName());
                listVals.add(f.getId()+"");
        }
        resultMap.put("names",listNames);
        resultMap.put("namesVal",listVals);
        return resultMap;
    }
}
