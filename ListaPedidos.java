/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos;

/**
 *
 * @author heito
 */
public class ListaPedidos {
    private NovosPedidos lista[];
    private int contador;
    
    public ListaPedidos(int capMax){
        lista = new NovosPedidos[capMax];
        contador =0;
    }
    
    public void cadastroPedido(NovosPedidos p){
        if(contador <= lista.length){
            if(lista[contador] == null){
                lista[contador] = p; 
                //contador++;
                for(int i =0;i<contador;i++){
                    if(lista[contador].getNum_pedido() == lista[i].getNum_pedido()){
                        System.out.println("Numero do pedido ja existe");
                        contador--;
                        break;                        
                    }
                }
                contador++;               
            }
        }else System.out.println("Lista esta cheia");
    }
    
    public void pagarVendedor(int numPed, double taxa){
        for(int i=0;i<contador;i++){
            if(lista[i].getNum_pedido() == numPed){
                if(lista[i].isVendedor_pago() == false){
                    lista[i].setVendedor_pago(true);
                    lista[i].setComissao(lista[i].getPreco()*taxa);
                    lista[i].setStatus_pedido(true);
                    break;
                    
                }else {
                    System.out.println("Vendedor ja recebeu");
                    
                }
            }
            
                System.out.println("Numero do pedido nao existe");
            }         
        } 
        //
        
    
    
    public void pedidosAberto(){
        System.out.println("Pedidos em aberto\n");
        for(int i =0;i<contador;i++){
            if(lista[i].isStatus_pedido() == false){
                
                lista[i].Print();
            }
        }
    }
   public void ListaPrint(){
       System.out.println("Todos pedidos\n");
       for(int i=0;i<contador;i++){
           lista[i].Print();
       }
   }
}
