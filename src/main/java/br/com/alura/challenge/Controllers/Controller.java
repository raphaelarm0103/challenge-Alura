package br.com.alura.challenge.Controllers;

import br.com.alura.challenge.Entities.Receitas;
import br.com.alura.challenge.Request.ReceitaDetalhe;
import br.com.alura.challenge.Request.ReceitasRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/receitas")
public class Controller {

    @PersistenceContext
    public EntityManager entityManager;

    @PostMapping
    @Transactional
    public String postReceitas(@RequestBody @Valid ReceitasRequest receitasRequest) {

        Receitas receitas = receitasRequest.toModel();

        entityManager.persist(receitas);

        return receitas.toString();
    }

    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity<ReceitaDetalhe> getReceitas(@PathVariable Long id){

        Receitas receitas = entityManager.find(Receitas.class, id);
        if (receitas == null){
            return (ResponseEntity<ReceitaDetalhe>) ResponseEntity.status(HttpStatus.NOT_FOUND);
        }
        ReceitaDetalhe receitaDetalhe = new ReceitaDetalhe(receitas);
        return ResponseEntity.ok(receitaDetalhe);
    }

}
