package com.mySpring.api.controler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mySpring.api.dao.EmployeeDao;
import com.mySpring.api.pojo.Employee;


@Controller
@RestController
public class EmployeeControler {
	@Autowired
	private EmployeeDao dao;
	private ModelAndView mv=new ModelAndView();
		@RequestMapping("/")
		public ModelAndView home() {
				mv.setViewName("home");
				return mv;
		}
		@RequestMapping("/insert")
		public ModelAndView insertData(HttpServletRequest req,HttpServletResponse res) {
			
			String name=req.getParameter("ename");
			String email=req.getParameter("eemail");
			String age=req.getParameter("eage");
			Employee emp=new Employee();
			emp.setEName(name);
			emp.setEAge(age);
			emp.setEEmail(email);
			Employee e1=dao.insertData(emp);
			System.out.println("Empl                      "+e1);
			if(e1!=null) {
				mv.setViewName("afterinsert");
			}else {
				mv.setViewName("home");
			}
			
			return mv;
			
		}
		@RequestMapping("/showData")
		public ModelAndView showData() {
			List<Employee> eall=dao.getAllEmployee();
			mv.addObject("allemp",eall );
			mv.setViewName("alldata");
			return mv;
		}
		@PutMapping("/update")
		public Employee update(@RequestBody Employee e) {
			return dao.update(e);
		}
		@DeleteMapping("/deleteData/{id}")
		public String deleteByid(@PathVariable int id) {
			return dao.deleteByid(id);
			}
		@GetMapping("/getdata")
		public List<Employee> allData(){
			return dao.getAllEmployee();
		}
		@ResponseBody
		@RequestMapping("/test")
		public ModelAndView mytest() {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("my.html");
			
			return mv;
			
		}
		

}
