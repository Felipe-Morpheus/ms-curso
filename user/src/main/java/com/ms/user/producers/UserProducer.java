package com.ms.user.producers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ms.user.dtos.EmailDto;
import com.ms.user.models.UserModel;

@Component
public class UserProducer {
	
	//injeção
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	//ATB/METODO REMETENTE/ENVIO DE MENSAGEM (nome da fila)
	@Value(value ="${broker.queue.email.name}")
	private String routingKey;
	
	//metodo
	public void publishMessageEmail(UserModel userModel) {
		var emailDto = new EmailDto();
		emailDto.setUserId(userModel.getUseId());
		emailDto.setEmailTo(userModel.getEmail());
		emailDto.setSubject("Cadastro realizado com sucesso!");
		emailDto.setText(userModel.getName()+ ", seja bem vindo(a)! \nAgradecemos o seu cadastro. Aproveite agora todos os recursos da nossa plataforma!");

		
		rabbitTemplate.convertAndSend("", routingKey, emailDto);

	}

}
