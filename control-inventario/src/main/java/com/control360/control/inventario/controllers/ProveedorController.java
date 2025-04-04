package com.control360.control.inventario.controllers;

import com.control360.control.inventario.models.Proveedor;
import com.control360.control.inventario.repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @GetMapping
    public List<Proveedor> listar() {
        return proveedorRepository.findAll();
    }

    @PostMapping
    public Proveedor guardar(@RequestBody Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }
}
