// package com.example.demo.controllers;

// import org.springframework.web.bind.annotation.RestController;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestBody;

// @RestController
// public class MyParamControllers {

// @GetMapping("/rest/query/param/")
// public String getQueryParam(@RequestParam("user") String name,
// @RequestParam("age") int age) {
// System.out.println("Name : " + name);
// System.out.println("Age : " + age);
// return "Welcome " + name + " You are " + age + " years old.";
// }

// @GetMapping("/rest/path/param/{name}/{age}")
// public String getPathParam(@PathVariable String name, @PathVariable int age)
// {
// System.out.println("Name : " + name);
// System.out.println("Age : " + age);
// return "Welcome " + name + " You are " + age + " years old.";
// }

// @GetMapping("/rest/body/param")
// public String getBodyParam(@RequestBody Emp e) {
// System.out.println("Name : " + e.getName());
// System.out.println("Age : " + e.getAge());
// return "Welcome " + e.getName() + " You are " + e.getAge() + " years old.";
// }

// @GetMapping("/rest/retrieve/employees")
// public List<Emp> getEmployees() {
// List<Emp> list = new ArrayList<Emp>();
// list.add(new Emp("Sooraj", 34));
// list.add(new Emp("Dheeraj", 45));
// list.add(new Emp("Neeraj", 23));
// list.add(new Emp("Pankaj", 35));
// return list;
// }

// }
