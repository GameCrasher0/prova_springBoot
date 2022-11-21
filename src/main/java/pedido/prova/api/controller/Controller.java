package pedido.prova.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pedido.prova.api.entity.Order;
import pedido.prova.api.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

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
    public Optional<Order> getOrderById(@PathVariable Long id) {
        Optional<Order> orderReturned = orderRepository.findById(id);
        return orderReturned;
    }

    @GetMapping
    public List<Order> getAllClients() {
        return orderRepository.findAll();
    }

    @DeleteMapping("{id}")
    public String deleteOrderById(@PathVariable Long id) {
        Optional<Order> clienteOptional = orderRepository.findById(id);
        if (clienteOptional.isPresent()) {
            orderRepository.deleteById(id);
            return "Pedido de id " + id + " foi deletado com sucesso!";
        } else {
            return "Pedido inexistente!";
        }
    }

    @PutMapping("update/{id}")
    public String updateOrderById(@PathVariable Long id, @RequestParam String novoNome) {
        Optional<Order> orderOptional = orderRepository.findById(id);
        if (orderOptional.isPresent()) {
            Order c = orderOptional.get();
            orderRepository.save(c);
            return "Cliente de id" + id + " salvo com sucesso!";
        } else {
            return "Cliente inexistente";
        }
    }
}