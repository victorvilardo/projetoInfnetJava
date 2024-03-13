package infnet.com.br.projetoInfnetJava.controller;

import infnet.com.br.projetoInfnetJava.model.QuartoSingle;
import infnet.com.br.projetoInfnetJava.service.QuartoSingleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/quartoSingle")
public class QuartoSingleController {
    @Autowired
    QuartoSingleService quartoSingleService;

    @GetMapping(path = "find/{id}")
    public ResponseEntity<QuartoSingle> findById(@RequestParam long id) {
        Optional<QuartoSingle> quartoOptional = quartoSingleService.findById(id);

        if (quartoOptional.isPresent()) {
            return ResponseEntity.ok(quartoOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping(path = "/findAll")
    public ResponseEntity<List<QuartoSingle>> findAll() {
        List<QuartoSingle> quartos = quartoSingleService.findAll();

        if (!quartos.isEmpty()) {
            return ResponseEntity.ok(quartos);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping("/add")
    public String adicionarQuartoSingle(@Valid @RequestBody QuartoSingle quartoSingle, BindingResult results) {
        if(results.hasErrors()){
            return "quartoSingle/add";
        }
        try{
            quartoSingleService.save(quartoSingle);
        }catch (ConstraintViolationException ex){
            Set<ConstraintViolation<?>> constraintViolations = ex.getConstraintViolations();
            System.out.println(constraintViolations);
        }
        return "redirect:index";
    }

    @GetMapping("/remover/{id}")
    public RedirectView removerQuartoSingle(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttributes){

        model.addAttribute("module", "quartoSingle");
        try{
            quartoSingleService.deleteById(id);
            redirectAttributes.addFlashAttribute("sucessoDelete",true);
        }catch (Exception ex){
            redirectAttributes.addFlashAttribute("sucessoDelete",false);
        }
        return new RedirectView("../quartosingle");
    }
}
