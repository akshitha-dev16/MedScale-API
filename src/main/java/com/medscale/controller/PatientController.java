package com.medscale.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    @GetMapping
    public String getPatients() {
        return "List of patients (MedScale-API)";
    }
}