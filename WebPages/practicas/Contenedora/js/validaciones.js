var expreNomyApe =/^[a-zA-ZÀ-ÿ\s]{1,40}$/;
var expreTel =/^\d{7,14}$/;
var expreEmail =/^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/;

function validacion() {
    if(document.frm.nombre.value.trim().length<=2 || !expreNomyApe.test(document.frm.nombre.value)){
        document.getElementById("nombre").focus();
        nom.style.display - " ";
        return false;
    }

    if(document.frm.apellido.value.trim().length<=2){
        document.getElementById("apellido").focus();

        return false;
    }

    if(document.frm.direccion.value.trim().length<=9){
        document.getElementById("direccion").focus();

        return false;
    }

    if(document.frm.telefono.value.trim().length<=9){
        document.getElementById("telefono").focus();

        return false;
    }



    frm.submit();
}
