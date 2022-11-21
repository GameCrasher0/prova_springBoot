package pedido.prova.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pedido.prova.api.entity.Order;
import pedido.prova.api.repository.OrderRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/pedido/v1/")
public class Controller {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    @ResponseBody
    public Order create(@RequestBody Order order) {
        Order orderSaved = orderRepository.save(order);
        return orderSaved;
    }

    @GetMapping("{id}")
    @ResponseBody
    public Optional<Order> getClienteById(@PathVariable Long id) {
        Optional<Order> clienteReturned = orderRepository.findById(id);
        return clienteReturned;
    }

    @GetMapping
    public List<Order> getAllClients() {
        return orderRepository.findAll();
    }

    @DeleteMapping("{id}")
    public String deleteClienteById(@PathVariable Long id) {
        Optional<Order> clienteOptional = orderRepository.findById(id);
        if (clienteOptional.isPresent()) {
            orderRepository.deleteById(id);
            return "Cliente de id " + id + " foi deletado com sucesso!";
        } else {
            return "Cliente inexistente!";
        }
    }

    @PutMapping("update/{id}")
    public String updateClienteById(@PathVariable Long id, @RequestParam String novoNome) {
        Optional<Order> clienteOptional = orderRepository.findById(id);
        if (clienteOptional.isPresent()) {
            Order c = clienteOptional.get();
            orderRepository.save(c);
            return "Cliente de id" + id + " salvo com sucesso!";
        } else {
            return "Cliente inexistente";
        }
    }
}