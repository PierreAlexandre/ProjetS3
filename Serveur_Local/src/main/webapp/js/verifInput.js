function inputVerification()
{
    var isValid = true;

    //VERIFICATION DU TITRE
    var title =  document.getElementById("input_title").value;
    if(title.length==0)
    {
        isValid=false;
        alert("Le titre de l'annonce ne peut pas etre vide");
        return;
    }
    else if(title.length>10)
    {
        isValid=false;
        alert("Le titre de l'annonce ne peut pas etre plus long que X caractere");
        return;
    }

    //VERIFICATION DU PRIX
    var price = document.getElementById("input_price").value;
    price = price.replace(/,/g, '.'); //remplace les virgules par un point

    if(price.length==0)
    {
        isValid=false;
        alert("Vous devez entrez un prix")
        return;
    }
    else if(!isNaN(price))     //test si le input est un nombre
    {
        if(price.includes(".")) //verification qu'il y ait seulement 2 chiffres apres la virgule
        {
            var positon = price.indexOf(".");
            if(price.length != positon+3)
                isValid = false;
        }
    }
    else
        isValid = false;

    if(!isValid)
    {
        alert("Le prix entré n'est pas valide");
        return;
    }

    //VERIFICATION DE L'ANNONCEUR
    var contact_info = document.getElementById("input_contact_info").value;
    if(contact_info.length==0)
    {
        isValid=false;
        alert("Vous devez entrez une facon de vous joindre");
        return;
    }




    console.log(test);
}
