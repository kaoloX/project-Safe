WebService para o Projeto Safe do grupo DevSec

WebService em RestFul

Técnologias utilizadas: Java 11 / Spring Framework / H2 Database

EndPoint *GET* responsável pela Busca de Itens pertencentes a uma determinada compra.

GET - /v1/safe/compras

Parametro de entrada:

    Valor        Descrição
 | IdCompra  |   Id da compra efetuada em determinado estabelecimento.
 
 Body de Saida JSON - Postman:
 
 {
        "id": 1,
        "numeroDoCartao": "5434",
        "valor": 10.00,
        "nomeDoProduto": "Calça",
        "nomeDoEstabelecimento": "Oakley"
    }
 
 
 EndPoint *POST* responsável por adicionar uma nova compra em um estabelecimento e demonstrar os dados da mesma.
 
        Valor          Descrição
   |numeroDoCartao        | Número do cartão utilizado na compra
   |valor                 | Valor utilizado na compra.
   |nomeDoProduto         | Nome do produto comprado.
   |nomeDoEstabelecimento | Nome do Estabelecimento onde foi realizada a compra.
   
   Body de Saida - JSON - PostMan:
   
   {
    "numeroDoCartao" : "5434",
    "valor" : 10.00,
    "nomeDoProduto" : "Calça",
    "nomeDoEstabelecimento" : "Oakley"
}
