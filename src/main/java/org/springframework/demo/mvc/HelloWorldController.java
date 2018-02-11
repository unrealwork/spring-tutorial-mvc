package org.springframework.demo.mvc;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

  // need controller method to show initial form
  @RequestMapping("/showForm")
  public String showForm() {
    return "helloworld-form";
  }

  // need controller method to process form
  @RequestMapping("/processForm")
  public String processForm() {
    return "helloworld";
  }

  // shouting controller method
  @RequestMapping("/processFormVersionTwo")
  public String letsShoutDude(HttpServletRequest request, Model model) {
    // read the request parametr
    String theName = request.getParameter("studentName");
    //convert the data to all caps
    theName = theName.toUpperCase();
    // create  the message
    String result = "Yo! " + theName;
    // add message to the model
    model.addAttribute("message", result);


    return "helloworld";
  }
}
