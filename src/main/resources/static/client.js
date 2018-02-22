$(document).ready(function () {

});



function gotoPerson(){
    //window.location.href = "/person"
    var searchString = $("#personSearch").val();
    window.location.href = "/person/" + searchString;
    console.log("click");
    }

function goHome(){
    window.location.href = "/";
   }

function gotoEverybody(){
    window.location.href = "/everybody";

}