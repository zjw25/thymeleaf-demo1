package com.offcn;

import com.offcn.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author zhan
 * @date 2021-01-13 22:01
 */
@Controller
@RequestMapping("thymeleafs")
public class ThymeleafController {

    //入门案例 -- 先了解一下thymeleaf模板引擎如何使用
    @GetMapping("first")
    public String first(Model model){
        //实现值的封装
          model.addAttribute("name", "zhangfei");

          //实现图片的加载
        model.addAttribute("pic","../1.jpg");

        //实现实体类对象封装的数据的处理
        UserVo userVo = new UserVo();
        userVo.setUid(0);
        userVo.setUname("关羽");
        userVo.setUsex("男");
        model.addAttribute("user",userVo);


        //封装一个集合
        ArrayList<UserVo> list = new ArrayList<>();
        UserVo userVo1 = new UserVo();
        userVo1.setUid(1);
        userVo1.setUname("关羽1");
        userVo1.setUsex("男1");
        list.add(userVo1);

        UserVo userVo2 = new UserVo();
        userVo2.setUid(2);
        userVo2.setUname("关羽2");
        userVo2.setUsex("男2");
        list.add(userVo2);

        UserVo userVo3= new UserVo();
        userVo3.setUid(3);
        userVo3.setUname("关羽3");
        userVo3.setUsex("男3");
        list.add(userVo3);
        model.addAttribute("ulist",list);


        //条件
        model.addAttribute("flag", "yes");
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");


        //测试日期对象

        model.addAttribute("data1",new Date());

        //测试数字对象
        model.addAttribute("num",3312.12313);


        //测试字符串对象
        model.addAttribute("str","Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" +\n" +
                "                \"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" +\n" +
                "                \"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n");


        return "index.html";
    }


}
