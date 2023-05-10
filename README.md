# Controlador-de-robo

Este foi um exercício mais complexo que nos foi passado na faculdade. O objetivo era passar comandos para um robo, e o mesmo precisava chegar ao final, explicando mais afundo o meu código, eu coloquei um "do" para comandar a seção inteira, caso o usuário perdesse, ele poderia jogar de novo, caso seu input fosse "s". Eu coloquei a popsição do robo de acordo com as linhas x,y. A segunda coisa que fiz, foi criar um looping para que enquanto o robo não estivesse na posição passada na estrutura de reptição "while", o programa não terminaria.

O código precisava ser composto por uma sequência de 7 comandos, nem mais, nem menos, e os inputs precisavam ser os corretos para cada linha, estarei colocando a imagem do mapa do robo aqui para que fique mais claro. 

Existe também uma mensagem personalisada caso a distância seja menor que a que foi passada na condicional, e existe um set para cada comando quando se é atingida a posição da linha, isso pode até ser considerado uma "gambiarra" , entretanto foi a solução mais plausível que eu encontrei para resolver isso, já que todas as vezes que eu rodava o código, o mesmo ficava truncando com as estruturas de repetição "while".

É importante ressaltar que existe um valor mínimo para a bateria do robo, caso isso seja menor do que a que foi passada no set, existe uma mensagem personalisada para isso.

Bem, este foi um código simples, mas trabalhoso, eu gostaria de ter usado variavéis lógicas, arrays e métodos, teria sido mais facil! Porém ainda não estamos vendo isso nas aulas, futuramente, talvez eu reposte este mesmo código resolvido com essas maneiras!

Inputs para chegar ao final: 

//		 1° comando: FRENTE, 9
//		 2° comando: DIREITA, 5
//		 3° comando : FRENTE, 4
//		 4° comando : DIREITA, 5
//		 5° comando : TRAS, 10
//		 6° comando : ESQUERDA, 4
// 		 7° comando : TRAS, 3
//		 bateria total gasta = 40

Proposta incial do projeto (caso queira repetir) : 


Entregar um programa, escrito em linguagem Java, que simule a movimentação do robô dentro desta pista. Os comandos serão dados pelo usuário em pares: COMANDO ("FRENTE", "TRÁS", "ESQUERDA", "DIREITA") e DISTÂNCIA (10, 5, 3, 2, etc.). Além disto, o programa deverá calcular qual deve ser a potência da bateria do robô para que o percurso possa ser completado.?

Serão válidos os ENTREGAVÉIS cuja pista possa ser concluída em até 7 pares de comandos e que os simuladores sejam capazes de verificar comandos VÁLIDOS ou INVÁLIDOS.?

ENTREGÁVEL: Pista e programa que (1) possa atingir o objetivo (completar o percurso) em até 7 pares de comandos e que (2) seja capaz de verificar comandos VÁLIDOS ou INVÁLIDOS.

Obrigado por ler este README, e lembre-se, não seja frango(a) e estude!
