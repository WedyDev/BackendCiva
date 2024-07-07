package pe.civa.civatecnica.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.civa.civatecnica.dtos.FutbolistasDTO;
import pe.civa.civatecnica.services.IFutbolistaServices;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/futbolistas")
public class FutbolistaController {

    @Autowired
    private IFutbolistaServices ifbs;

    @GetMapping
    public List<FutbolistasDTO> list() {
        try {
            return ifbs.list().stream().map(x -> {
                ModelMapper m = new ModelMapper();
                return m.map(x, FutbolistasDTO.class);
            }).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @GetMapping("/{id}")
    public FutbolistasDTO listarId(@PathVariable("id") Integer id) {
        try {
            ModelMapper m = new ModelMapper();
            return m.map(ifbs.listId(id), FutbolistasDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
