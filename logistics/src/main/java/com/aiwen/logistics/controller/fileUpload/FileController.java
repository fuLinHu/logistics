package com.aiwen.logistics.controller.fileUpload;

import com.aiwen.logistics.pojo.Tradingfilemanage;
import com.aiwen.logistics.service.TradingFileManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by admin on 2018/5/5.
 */
@Controller
@RequestMapping(value = "fileManage")
public class FileController {
    @Autowired
    private TradingFileManageService tradingFileManageService ;

    public String getPropertiesVal(String val){
//        ResourceBundle res = ResourceBundle.getBundle("uploadUrl.properties");
        Properties properties = new Properties();

        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("uploadUrl.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String test = properties.getProperty(val);
        return test;
    }
    @RequestMapping("/filesUpload")
    public String  filesUpload(@RequestParam("file") MultipartFile[] files) {
        String path = this.getPropertiesVal("receptionUploadUrl");
        if(files!=null&&files.length>0){
            StringBuffer filenameBuf = new StringBuffer();
            StringBuffer fileurlBuf = new StringBuffer();
            Tradingfilemanage tradingfilemanage = new Tradingfilemanage();
            //循环获取file数组中得文件
            for(int i = 0;i<files.length;i++){
                Boolean flag = false;
                if (i!= files.length-1){
                    flag = true;
                }
                MultipartFile file = files[i];
                //保存文件
                if(file.getSize()>0){
                    saveFile(file, path,filenameBuf,fileurlBuf , flag);
                }
            }
            if(filenameBuf.toString()!=null&&!"".equals(filenameBuf.toString())&&fileurlBuf.toString()!=null&&!"".equals(fileurlBuf.toString())){
                tradingfilemanage.setFileName(filenameBuf.toString());
                tradingfilemanage.setFileUrl(fileurlBuf.toString());
                tradingfilemanage.setCreateTime(new Date());
                this.tradingFileManageService.save(tradingfilemanage);
            }
        }
        return  "redirect:/goodQuotations/goodQuotationsList";
//        return "goodquotations/goodquotations";
    }

    private boolean saveFile(MultipartFile file, String path,StringBuffer filenameBuf,StringBuffer fileurlBuf, boolean flag) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                File filepath = new File(path);
                if (!filepath.exists()){
                    filepath.mkdirs();
                }

                String fileNewName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("\\")+1);

                String type = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));//取后缀名
                String fileName = System.currentTimeMillis()+type;//取当前时间搓作为文件名
                // 文件保存路径
                String savePath = path + File.separator + fileName;
                filenameBuf.append(fileNewName);
                fileurlBuf.append(savePath);
                if (flag){
                    filenameBuf.append("|");
                    fileurlBuf.append("|");
                }
                // 转存文件
                file.transferTo(new File(savePath));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @RequestMapping("/carImageUpload")
    @ResponseBody
    public String getCarImageUpload(@RequestParam("file") MultipartFile files) throws IOException {
        String resultPath = "";
        if (!files.isEmpty()){
            String type = files.getOriginalFilename().substring(files.getOriginalFilename().indexOf("."));//取后缀名
            String fileName = System.currentTimeMillis()+type;//取当前时间搓作为文件名
            String path = this.getPropertiesVal("receptionUploadUrl");
            File filepath = new File(path,fileName);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件当中
            resultPath =fileName;
            String savePath = path + File.separator + fileName;
            files.transferTo(new File(savePath));
        }
        return resultPath;
    }

    @RequestMapping("/driverImageUpload")
    @ResponseBody
    public String getDriverImageUpload(@RequestParam("file") MultipartFile files) throws IOException {
        String resultPath = "";
        if (!files.isEmpty()){
            String type = files.getOriginalFilename().substring(files.getOriginalFilename().indexOf("."));//取后缀名
            String fileName = System.currentTimeMillis()+type;//取当前时间搓作为文件名
            String path = this.getPropertiesVal("receptionUploadUrl");
            File filepath = new File(path,fileName);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件当中
            resultPath =fileName;
            String savePath = path + File.separator + fileName;
            files.transferTo(new File(savePath));
        }
        return resultPath;
    }

    @RequestMapping("/complainImageUpload")
    @ResponseBody
    public String getComplainImageUpload(@RequestParam("file") MultipartFile files) throws IOException {
        String resultPath = "";
        if (!files.isEmpty()){
            String type = files.getOriginalFilename().substring(files.getOriginalFilename().indexOf("."));//取后缀名
            String fileName = System.currentTimeMillis()+type;//取当前时间搓作为文件名
            String path = this.getPropertiesVal("receptionUploadUrl");
            File filepath = new File(path,fileName);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件当中
            resultPath =fileName;
            String savePath = path + File.separator + fileName;
            files.transferTo(new File(savePath));
        }
        return resultPath;
    }

    @RequestMapping("/getPaths")
    @ResponseBody
    public String getPaths(HttpServletRequest request) throws IOException {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        // 获取文件对象
        MultipartFile file = multipartRequest.getFile("file");
        String resultPath = "";
        if (!file.isEmpty()){
            String type = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));//取后缀名
            String fileName = System.currentTimeMillis()+type;//取当前时间搓作为文件名
            String path = this.getPropertiesVal("receptionUploadUrl");
            File filepath = new File(path,fileName);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件当中
            resultPath =fileName;
            String savePath = path + File.separator + fileName;
            file.transferTo(new File(savePath));
        }
        return resultPath;

    }
}
