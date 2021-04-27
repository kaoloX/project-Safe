package br.com.fiap.Safe.service;

import br.com.fiap.Safe.models.Compra;
import br.com.fiap.Safe.service.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {

    @Autowired
    private CompraRepository rep;

    public void adicionarCompra(Compra request){

        rep.save(request);
    }

    public Compra buscarCompraPorId(Long id) {

        return rep.findById(id).orElseThrow(() -> new RuntimeException("Id Não Encontrado"));

    }

    public List<Compra> buscarTodasCompras() {

        return rep.findAll();
    }
}
