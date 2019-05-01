package com.word.controller;



import com.word.pojo.User;
import com.word.pojo.Word;
import org.apache.commons.collections.map.HashedMap;
import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Map;


@Controller
public class layuiUploadController {

    @RequestMapping("/upload")
    @ResponseBody
    public Map<String,Integer> uploadImg(MultipartFile file, Word word, HttpServletRequest request) {
        System.out.println("keyi"+word.getWordName());
        String path = request.getSession().getServletContext().getRealPath("/upload");
        System.out.println(path);
        System.out.println();
        System.out.println("成功");
        String filename = file.getOriginalFilename();
        System.out.println("OriginalName"+filename);
        File dir = new File(path,filename);
        System.out.println("?????exists"+dir.exists());
        Map<String,Integer> map = new HashedMap();
        map.put("code",0);
        return map;

    }

    @RequestMapping(value = "/secondsave" ,method = RequestMethod.POST)

    public String secondsave(@RequestParam(value = "file1") MultipartFile file,@RequestParam("file2") MultipartFile file1,@RequestParam("username") String username, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println(file.getOriginalFilename());
        System.out.println(file1.getOriginalFilename());
        System.out.println("名字"+username);
//        request.getServletContext().getRequestDispatcher("/test.jsp").forward(request,response);
        return "ok";
    }

}
