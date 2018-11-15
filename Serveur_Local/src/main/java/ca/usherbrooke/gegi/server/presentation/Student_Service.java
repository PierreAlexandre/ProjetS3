package ca.usherbrooke.gegi.server.presentation;


import ca.usherbrooke.gegi.server.business.Student;

import ca.usherbrooke.gegi.server.persistence.Student_Mapper;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import java.util.List;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.POST;

@Path("student")
public class Student_Service {

    @Context
    HttpServletRequest httpServletRequest;

    @Inject
    Student_Mapper student_Mapper;


    @GET
    public void creat_Student(){
        System.out.println("insert ok test 1");
        Student student = new Student();
        student.setCip(httpServletRequest.getUserPrincipal().getName());
        student.setUser_name("student11");
        student.setE_mail("cip11@ush.ca");
        student.setPhone("819-000 2222");


        student_Mapper.insertStudent(student);
        System.out.println("insert ok test 2");





    }



}
