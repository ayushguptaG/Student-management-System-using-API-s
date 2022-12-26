package com.example.studentmanagementsystem;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController  // defining that this class will have API endpoints
public class StudentController {

    // Creating Database
    HashMap<String, Student> studentdb= new HashMap<>();

    //Adding Student
    @PostMapping("/add_student")
    public String addStudent(@RequestBody() Student student){

        String key= student.getId();

        studentdb.put(key,student);

        return "Student added successfully";
    }

    @GetMapping("/get_student_by_id")
    public Student getStudentById(@RequestParam("id") String id){

        return studentdb.get(id);
    }

    @GetMapping("/get_student_by_name")
    public Student getStudentByName(@RequestParam("name") String name) {

        for (Student s : studentdb.values()) {

            if (s.getName().equals(name)) {
                return s;
            }
        }
        // no similar student is found
        return null;
    }

    @GetMapping("/get_by_path/{id}")
    public Student getByPath(@PathVariable("id") String id){

        return studentdb.get(id);
    }

    @DeleteMapping("/delete_student")
    public String deleteStudent(@RequestParam("id") String id){

        studentdb.remove(id);
        return "Student deleted successfully";
    }

    @PutMapping("/update_student_by_param")
    public String updateStudent(@RequestParam String id,@RequestParam String course){

        for(Student s : studentdb.values()){
            if(s.getId().equals(id)){
                s.setCourse(course);
            }
        }

        return "Updated Successfully";
    }

    @PutMapping("/update_student_by_body")
    public Student updateStudent(@RequestBody Student student){

        String key= student.getId();

        studentdb.put(key, student);
        return student;
    }

}
