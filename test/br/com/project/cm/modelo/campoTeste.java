package br.com.project.cm.modelo;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.project.cm.excecao.explosaoException;
import br.com.project.cm.modelo.Campo;

public class campoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
		
			}
	
	@Test
	void testeVizinhoDistancia1Direita(){ 
		Campo vizinho = new Campo(3,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
		
	}
	
	
	@Test
	void testeVizinhoDistancia1EmCima() {
		Campo vizinho = new Campo(2,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
		
	
	}
		

		@Test
		void testeVizinhoDistancia1Embaixo() {
			Campo vizinho = new Campo(4,3);
			boolean resultado = campo.adicionarVizinho(vizinho);
			
			assertTrue(resultado);
			
		
		
		}
			
			@Test
			void testeVizinhoDistancia2() {
				Campo vizinho = new Campo(2,2);
				boolean resultado = campo.adicionarVizinho(vizinho);
				
				assertTrue(resultado);
				
			}
			
			
		
			@Test
			void testeNaoVizinho() {
				Campo vizinho = new Campo(1,1);
				boolean resultado = campo.adicionarVizinho(vizinho);
				
				assertFalse(resultado);
				
			}
			
			
			
			
			@Test
			void testeValorPadraoAtributoMarcado() {
				assertFalse(campo.isMarcado());
				
			}
		
			
			
			
			
			@Test
			void testeAlternarMarcacao() {
				campo.alternarMarcacao();
              assertFalse(campo.isMarcado());
             
			}
		
		
		
			@Test
			void testeAlternarMarcacaoDuasChamadas() {
				campo.alternarMarcacao();
				campo.alternarMarcacao();

              assertFalse(campo.isMarcado());
             
			}
		
			@Test
			void testeNaoMinadoNaomarcado() {
				

              assertTrue(campo.abrir());
             

			}
	
	
			@Test
			void testeNaoMinadoMarcado() {
				campo.alternarMarcacao();
                campo.minar();
              
              assertFalse(campo.abrir());
             

			}
			

			@Test
			void testeAbrirMinadoNaoMarcado() {
                campo.minar();
            
               assertThrows(explosaoException.class, () -> {
            	   campo.abrir();
               });			
			
			
			}
			
			
			
			
			
			@Test
			void testeAbrirComVizinhos() {
				Campo campo11 = new Campo(1,1);
				Campo campo22 = new Campo(2,2);
			campo22.adicionarVizinho(campo11);
			
				campo.adicionarVizinho(campo22);
				
				campo.abrir();

              assertTrue(campo22.isAberto() && campo11.isAberto());
             
			}
			
			
			@Test
			void testeAbrirComVizinhos2() {
				Campo campo11 = new Campo(1,1);
				Campo campo12 = new Campo(1,2);
			
				campo.adicionarVizinho(campo11);
				campo12.minar();
				
				Campo campo22 = new Campo(2,2);
				campo22.adicionarVizinho(campo11);
				campo22.adicionarVizinho(campo12);
				
				campo22.adicionarVizinho(campo22);
				campo.abrir();


              assertFalse(campo22.isAberto() && campo11.isFechado());
             
			}
			
			
			
	}



