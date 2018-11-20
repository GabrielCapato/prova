<%@page import="java.util.Date"%>
<%@page import="br.com.grupointegrado.model.Mensagem"%>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Usuário 63 - Super Chat</title>

    <link rel="stylesheet" type="text/css" href="CSS/fontawesome.all.min.css">
    <link rel="stylesheet" type="text/css" href="CSS/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="CSS/style-chat.css">

    <script>
        function validarMensagem(String msg) {
            if(msg !== null){
            return true;
        }
        return false;
        }
    </script>
</head>

<body>
     <div class="container">
        <h3 class=" text-center">Super Char! (Usuário 63)</h3>
        <div class="mesgs">
            <div id="msg_history">
             <% try {
                       
                   if(!request.getAttribute("newMSG").equals("")){
                Mensagem obj = (Mensagem) request.getAttribute("newMSG");%>
                  <div class="outgoing_msg">
                    <div class="sent_msg">
                        <p><%= obj.getMensagem()%></p>
                        <span class="time_date">/span>
                    </div>
                </div>
                  <%}
                   } catch (NullPointerException ex) {
                   ex.printStackTrace();
                   }%>
                  
<!--                 <div class="incoming_msg">
                    <div class="incoming_msg_img">
                        <img src="imagens/user-profile.png">
                    </div>
                    <div class="received_msg">
                        <div class="received_withd_msg">
                            <strong>Usuário 382</strong>
                            <p>Obrigado!</p>
                            <span class="time_date">Seg, 19 nov 2018, 16:52</span>
                    </div>
                </div>
                  -->
                 </div> 
                 </div>
                <div class="type_msg">
                    <form class="input_msg_write" action="chat" method="POST" onsubmit="return validarMensagem();">
                    <div class="form-group">
                        <textarea id="write_msg" name="mensagem" class="form-control" placeholder="Escreva sua mensagem..."></textarea>
                        <div class="invalid-feedback">
                            Informe sua mensagem antes de enviar.
                        </div>
                    </div>
                    <button class="msg_send_btn" type="submit">
                        <i class="fas fa-paper-plane"></i>
                    </button>
                </form>
                </div>
            </div>
        </div>
    <script src="js/jquery-3.3.1.slim.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/componente-util.js"></script>

    <script>
        textAreaAutoAjustar('write_msg');

        rolarAoFinal('msg_history')
    </script>
</body>

</html>
