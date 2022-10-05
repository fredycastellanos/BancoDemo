$(document).ready(function(){
alert("Consulta cliente")
consultarclientes();

function consultarclientes(){
$.ajax({
url:"http://localhost:8080/cliente",
type:"GET",
dataType:"JSON",
success:function(respuesta){
console.log(respuesta)
mostrartabla(respuesta)
}

});

}
function mostrartabla(filas){
let tabla="<table>";
for(i=0;i<filas.length;i++){
tabla+="<tr>";
tabla+="<td>"+filas[i].documento+"</td>"
tabla+="<td>"+filas[i].nombre+"</td>"
tabla+="<td>"+filas[i].apellido+"</td>"
tabla+="<td>"+filas[i].correo+"</td>"
tabla+="<td>"+filas[i].celular+"</td>"
tabla+="</tr>"

}

tabla+="</table>"
$("#contenedor").append(tabla)
}



function guardarCliente(){
 let datos={
 documento:$("#doc").val(),
 nombre:$("#nom").val(),
 apellido:$("#ape").val(),
 correo:$("#cor").val(),
 celular:$("#cel").val()
 }

 let datosEnvio=JSON.stringify(datos);
 $.ajax({
 url:"http://localhost:8080/cliente",
 type:"POST",
 data:datosEnvio,
 contentType:"application/JSON",
 dataType:"JSON",
 success:function(respuesta){
 if(respuesta!=null){
 alert("Datos guardados")
 }
 else{
 alert("Los datos no se guardaron")
 }
 }

 });

}

$("#btnguardar").on('click',function(){
  alert("en guardar")
  guardarCliente()
  consultarclientes()
});

function actualizarCliente(){
 let datos={
 documento:$("#doc").val(),
 nombre:$("#nom").val(),
 apellido:$("#ape").val(),
 correo:$("#cor").val(),
 celular:$("#cel").val()
 }


 let datosEnvio=JSON.stringify(datos);
 $.ajax({
 url:"http://localhost:8080/cliente",
 type:"PUT",
 data:datosEnvio,
 contentType:"application/JSON",
 dataType:"JSON",
 success:function(respuesta){
 if(respuesta!=null){
 alert("Datos actualizados")
 }
 else{
 alert("Los datos no se actualizaron")
 }
 }

 });

}

$("#btnactualizar").on('click',function(){
actualizarCliente()
consultarclientes()
})

function eliminar(){
let doc=$('#eliminar').val();
$.ajax({
url:"http://localhost:8080/cliente/"+doc,
type:"DELETE",
success:function(res){
if(res!=null){
alert("El datos se elimino")
}
}
})
}

$('#btneliminar').on('click',function(){
alert("Eliminar")
eliminar();
});

function buscaruncliente(){
let dato=$('#buscar').val();
$.ajax({
url:"http://localhost:8080/cliente/"+dato,
type:"GET",
dataType:"JSON",
success:function(res){
console.log(res);
mostrardatos(res);
}
})

}
$('#btnbuscar').on('click',function(){
 alert("consultar un")
 buscaruncliente();

})

function mostrardatos(dat){
let datoscli="<form >"
datoscli+="<input type='text' id='doc1' value="+dat.documento+">"
datoscli+="<input type='text' id='nom1' value="+dat.nombre+">"
datoscli+="<input type='text' id='ape1' value="+dat.apellido+">"
datoscli+="<input type='text' id='cor1' value="+dat.correo+">"
datoscli+="<input type='text' id='cel1' value="+dat.celular+">"
datoscli+="<input type='button' id='btnactualizaruno' value='Actualizar'>"
datoscli+="</form>"
$('#contenedorunregistro').append(datoscli);

}

$('#btnactualizaruno').on('click',function(){
  alert("nuevo boton")

})

});