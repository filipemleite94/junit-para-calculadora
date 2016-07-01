//Essa classe vai ser onde acontece de verdade as opera��es da calculadora.
public class Valor {
	//inicializa��o das vari�veis que v�o ser utilizadas.
	protected double valor1, valor2;
	protected char operando2;
	public Valor(){
		valor1=0;
		valor2=0;
		operando2='+';
	}
	
	//Opera��es a ser realizadas
	public double operacoes(char operando){
		if(operando2=='+'){
			valor1=valor1+valor2;
		}
		else if(operando2=='-'){
			valor1=valor1-valor2;
		}
		else if(operando2=='*'){
			valor1=valor1*valor2;
		}
		else if(operando2=='/'){
			if (valor2==0){
				valor1=99999999.0;
				operando2=operando;
				return -2;
			}
			valor1=valor1/valor2;
		}
		if (operando=='='){
			System.out.print(valor1);
		}
		
		//Uma vez guardado o resultado da opera��o passada no valor1 reinicia-se a vari�vel valor 2 e prepara-se
		//o operando pra receber uma nova opera��o.
		valor2=0;
		operando2=operando;
		if (operando=='='){
			return valor1;
		}
		return -1;
	}
	
	//Aqui o valor que est� entre operandos � armazenado em valor 2
	public void read(double valor){
		if(operando2=='='){
			valor1=0;
			operando2='+';
		}
		valor2=10*valor2+valor;
	}
	
	//A calculadora � reniciada
	public void clear(){
		valor1=0;
		valor2=0;
		operando2='+';
	}
}
