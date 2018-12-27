package com.aiwen.logistics.controller.userMessagePerfect;

import com.aiwen.logistics.pojo.EnterpriseInfo;
import com.aiwen.logistics.pojo.PersonalInfo;
import com.aiwen.logistics.pojo.UserFront;
import com.aiwen.logistics.service.UserMessagePerfectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by hp on 2018/5/5.
 */
@Controller
@RequestMapping(value = "userMessagePerfect")
public class UserMessagePerfectController {

    @Autowired
    private UserMessagePerfectService ums;
    /*
     * @author 跳转到（用户信息页面）
     * @date 2018/5/5 12:29
     * @param [request]
     * @return org.springframework.web.servlet.ModelAndView   syscodes
     */
    @RequestMapping(value = "skipUserInfromation")
    private ModelAndView skipUserInfromation(HttpServletRequest request){
        HttpSession session = request.getSession();
        UserFront userFront = (UserFront) session.getAttribute("userFront");
        ModelAndView modelAndView = new ModelAndView("userMessagePerfect/userInformation");
        try {
            if(null != userFront){
                if( null != userFront.getUserName() && !"".equals(userFront.getUserName()) && !userFront.getUserName().isEmpty()){
                    List list =  ums.userEchoMessage(userFront.getUserId());
                    List regionList = ums.RegionUser(userFront.getUserId());
                    List<EnterpriseInfo>  firmList = ums.userFirmMessage(userFront.getUserId());
                    if (firmList!=null&&firmList.size()>0){
                        String imageUrls=firmList.get(0).getCorporateAptitude();
                        String[] imageArray = imageUrls.split(",");
                        modelAndView.addObject("images", Arrays.asList(imageArray));
                    }
                    modelAndView.addObject("userName",userFront.getUserName());
                    modelAndView.addObject("echo",list);
                    modelAndView.addObject("syscodes",regionList);
                    modelAndView.addObject("firm",firmList);
                }else{
                    modelAndView.addObject("userName","-------");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return modelAndView;
    }

    /*
     * @author 用户信息管理 个人信息完善（杜宗昊）
     * @date 2018/5/5 12:22
     * @param [personalInfo]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    @RequestMapping(value = "userPersonageInsert")
    @ResponseBody
    private ModelAndView userPersonageInsert(PersonalInfo personalInfo,HttpServletRequest request,String userName){
        ModelAndView mv=new ModelAndView("userMessagePerfect/userInformation");
        HttpSession session = request.getSession();
        String alipayAccountRealName = null;
        try {
//            alipayAccountRealName = new  String(request.getParameter("alipayAccountRealName").getBytes("ISO8859-1"),"utf-8");
            alipayAccountRealName= request.getParameter("alipayAccountRealName");
            personalInfo.setAlipayAccountRealName(alipayAccountRealName);
            UserFront userFront = (UserFront) session.getAttribute("userFront");
            Map<String,Object>  map = null;
            if(null != userFront){
                if( null != userFront.getUserId()){
                    try {
                        if(null != personalInfo ){
                            personalInfo.setUserId(userFront.getUserId());
                            userFront.setUserName(userName);
                            map = ums.userPersonageInsert(personalInfo,request);
                        }
                        if( null != userFront.getUserName() && !"".equals(userFront.getUserName()) && !userFront.getUserName().isEmpty()){
                            List list =  ums.userEchoMessage(userFront.getUserId());
                            List regionList = ums.RegionUser(userFront.getUserId());
                            List  firmList = ums.userFirmMessage(userFront.getUserId());
                            mv.addObject("userName",userFront.getUserName());
                            mv.addObject("echo",list);
                            mv.addObject("syscodes",regionList);
                            mv.addObject("firm",firmList);
                        }else{
                            mv.addObject("userName","-------");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else{
                    map.put("statr",0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
    /*
     * @author  公司所在行业回显（杜宗昊）
     * @date 2018/5/5 12:50
     * @param []
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    @RequestMapping(value = "userCompanySelectOnchange")
    @ResponseBody
    private Map<String,Object>  userCompanySelectOnchange(){
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            map= ums.userCompanySelectOnchange();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  map;
    }
    /*
     * @author  用户信息管理 公司信息完善（杜宗昊）
     * @date 2018/5/5 13:44
     * @param [enterpriseInfo, request]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    @RequestMapping(value = "userCompanyInsert")
    @ResponseBody
    private Map<String,Object> userCompanyInsert(EnterpriseInfo enterpriseInfo,HttpServletRequest request){
        HttpSession session = request.getSession();
        UserFront userFront = (UserFront) session.getAttribute("userFront");
        Map<String,Object> map = null;
        if(null != userFront){
            if(null != userFront.getUserId()){
                try {
                    if(null != enterpriseInfo){
                        //企业之路径
//                        enterpriseInfo.setCorporateAptitude("----------------");
                        enterpriseInfo.setUserId(userFront.getUserId());
                        map = ums.userCompanyInsert(enterpriseInfo,request);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return map;
    }
    /*
     * @author 文件上传（杜宗昊）
     * @date 2018/5/5 15:26
     * @param [request, file]
     * @return java.lang.String
     */
//    @RequestMapping("/upload")
//    @ResponseBody
//    public String  upload(HttpServletRequest request, @RequestParam("file3") MultipartFile file) throws Exception {
//        String url = "";
//        if (!file.isEmpty()) {
//
////            String path1 = request.getSession().getServletContext().getRealPath("/");
////            String parentpath = new File(path1).getParent();
////            System.out.println(path1);
////            System.out.println(parentpath);
//            //上传文件路径
//            String fileNewName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("\\") + 1);
//            String type = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));//取后缀名
//            String fileName = System.currentTimeMillis() + type;//取当前时间搓作为文件名
//            String path = "E:\\updateFile";
//            File filepath = new File(path, fileName);
//            //判断路径是否存在，如果不存在就创建一个
//            if (!filepath.getParentFile().exists()) {
//                filepath.getParentFile().mkdirs();
//            }
//            //将上传文件保存到一个目标文件当中
//            file.transferTo(new File(path + File.separator + fileName));
//            url = path + File.separator + fileName;
////            System.out.println(path + File.separator + fileName);
////            FileManage fileManage = new FileManage();
////            fileManage.setFileName(fileNewName);
////            fileManage.setFileUrl(path + File.separator + fileName);
////            fileManage.setCreateTime(new Date());
////            int n=this.fileManageService.save(fileManage);
////            if (n >=1){
////                System.out.println("保存成功");
////            }else {
////                System.out.println("保存失败");
////            }
//            return url;
//        }
//        return url;
//    }

}
