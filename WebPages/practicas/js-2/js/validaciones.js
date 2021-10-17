function valida_envio(){
    if(document.frm1.txtnombre.value.trim().length == 0){
        alert("Favor de escribir su nombre");
        document.frm1.txtnombre.focus();
        return false;
    }
    if(document.frm1.txtapp.value.trim().length == 0){
        alert("Favor de escribir sus apellidos");
        document.frm1.txtapp.focus();
        return false;
    }
    if(document.frm1.txtedad.value.trim().length == 0){
        alert("Favor de escribir su edad");
        document.frm1.txtedad.focus();
        return false;
    }
    if(document.frm1.txtcomentarios.value.trim().length == 0){
        alert("Favor de escribir sus comentarios");
        document.frm1.txtedad.focus();
        return false;
    }

    frm1.submit();
}
