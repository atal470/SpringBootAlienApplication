package com.example.demo;

import com.example.demo.model.Alien;
import com.example.demo.service.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;


@Controller
public class HomeController {
    @Autowired
    AlienRepo alienRepo;

//    @RequestMapping("/")
//    public String home()
//    {
//        return "home.jsp";
//    }
//    @RequestMapping("/addAlien")
//    public String addlien(Alien alien){
//        alienRepo.save(alien);
//        return "home.jsp";
//    }
//    @RequestMapping("/getAlien")
//    public ModelAndView getAlien(@RequestParam int aid){
//        Alien alien= alienRepo.findById(aid).orElse(new Alien());
//        ModelAndView mv=new ModelAndView();
//        mv.addObject(alien);
//        mv.setViewName("showapp.jsp");
//        System.out.println(mv);
//        System.out.println("value"+alienRepo.findByLang("Python").toString());
//        System.out.println(alienRepo.findByAidGreaterThan(103));
//        System.out.println(alienRepo.findByTechSorted("Python"));
//        return mv;
//
//    }
        @RequestMapping("/aliens")
        @ResponseBody
        public List<Alien> Alien(){
            return alienRepo.findAll();
}
    @RequestMapping("/alien/{pid}")
    @ResponseBody
    public Optional<Alien> Alien(@PathVariable("pid") int pid){
        return alienRepo.findById(pid);
    }
}
