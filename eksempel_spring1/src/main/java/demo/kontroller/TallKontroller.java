/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.kontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author matzu
 */
@Controller
public class TallKontroller {
    @RequestMapping("/")
    public String visStartView(){
        System.out.println("I viewStartView() **************");
        return "/WEB-INF/jsp/index.jsp";
    }
}
