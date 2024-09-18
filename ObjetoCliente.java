package Setembro18;

public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente ("Giovana", 56891, "15998653", "47801553802", "56432190");
		
		
		cliente.setNome("Nome: Giovana");
		System.out.println(cliente.getNome());
		
		cliente.setId(56891);
		System.out.println(cliente.getId());
		
		cliente.setTelefone( "Telefone: 15998653");
		System.out.println(cliente.getTelefone());
		
		cliente.setCpf("Cpf: 47801553802");
		System.out.println(cliente.getCpf()); 
			
		cliente.setRg("Rg: 56432190");
		System.out.println(cliente.getRg()); 
	
	}}