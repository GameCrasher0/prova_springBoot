package pedido.prova.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pedido.prova.api.entity.Pedido;
import pedido.prova.api.repository.PedidoRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pedido/v1/")
public class Controller {

    @Autowired
    private PedidoRepository pedidoRepository;

    @PostMapping
    @ResponseBody
    public Pedido create(@RequestBody Pedido pedido) {
        Pedido pedidoSaved = pedidoRepository.save(pedido);
        return pedidoSaved;
    }

    @GetMapping("{id}")
    @ResponseBody
    public Optional<Pedido> getPedidoById(@PathVariable Long id) {
        Optional<Pedido> orderReturned = pedidoRepository.findById(id);
        return orderReturned;
    }

    @GetMapping
    public List<Pedido> getAllClients() {
        return pedidoRepository.findAll();
    }

    @DeleteMapping("{id}")
    public String deleteOrderById(@PathVariable Long id) {
        Optional<Pedido> clienteOptional = pedidoRepository.findById(id);
        if (clienteOptional.isPresent()) {
            pedidoRepository.deleteById(id);
            return "Pedido de id " + id + " foi deletado com sucesso!";
        } else {
            return "Pedido inexistente!";
        }
    }

    @PutMapping("update/{id}")
    public String updatePedidoById(@PathVariable Long id) {
        Optional<Pedido> pedidoOptional = pedidoRepository.findById(id);
        if (pedidoOptional.isPresent()) {
            Pedido c = pedidoOptional.get();
            pedidoRepository.save(c);
            return "Pedido de id" + id + " salvo com sucesso!";
        } else {
            return "Pedido inexistente";
        }
    }
}