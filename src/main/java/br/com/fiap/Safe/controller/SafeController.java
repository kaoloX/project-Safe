package br.com.fiap.Safe.controller;

import br.com.fiap.Safe.models.Compra;
import br.com.fiap.Safe.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.ResponseEntity.status;


@RestController
@RequestMapping("v1/safe")
public class SafeController {

    @Autowired
    private CompraService service;

    @PostMapping("/compras")
    public ResponseEntity <Object> comprarItem(@RequestBody Compra request){

        service.adicionarCompra(request);
        return status(CREATED).build();

    }

    @GetMapping("/compra")
    public ResponseEntity<Compra> buscarItem(@RequestParam("idCompra") Long id){

        Compra compra = service.buscarCompraPorId(id);
        return status(OK).body(compra);
    }

    @GetMapping("/compras")
    public ResponseEntity<List<Compra>>  buscarTodasCompras(){

        List<Compra> compras = service.buscarTodasCompras();
        return status(OK).body(compras);
    }

}
