package classesobjetos.carrinhocompras;

public class Produto {

    private String name;
    private Double preco;
    private Integer quantity;

    public Produto(String name, Double price, Integer quantity) {
        this.name = name;
        this.preco = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return preco;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
