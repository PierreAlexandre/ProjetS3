function main()
{


    var formParameter = document.getElementById("formParameter").value;
    var xmlhttp = new XMLHttpRequest();
    var url = "api/annonce_start?id=1" + formParameter;

    xmlhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var myArr = JSON.parse(this.response);
            // document.getElementById("main").innerHTML = this.response;

            var reponse = this.response.split("{");

            var mainDiv = document.getElementById("divMain");

            var i;
            for(i = 1;i < reponse.length; i++) {     //pour chaque annonce presente dans la reponse du serveur
                //Creation de l'espace entre chaque annonce
                var p2 = document.createElement('p');
                mainDiv.appendChild(p2);

                //Creation d'une annonce
                var div = document.createElement('div');
                div.className = "Annonce";
                div.style = "height:180px";

                div.innerHTML += "<div>\n" + "<p style=\"float: left;\"><img src=\"cap.png\" alt=\"Cap Icon\" height=\"120px\" width=\"120px\" border=\"1px\"></p>\n";
                if((reponse[i].includes('_titre_annonce":"'))&&(reponse[i].includes(',"_prix":')))
                {
                    div.innerHTML += "<h2>" +FindPostTag('_titre_annonce":"',reponse[i])+" - "+ FindPostTag(',"_prix":',reponse[i])  +"</h2>";
                }
                if((reponse[i].includes('_nom_article":"'))&&(reponse[i].includes(',"_prix":')))
                    div.innerHTML += "<h3>" +"Titre de l'article : "+FindPostTag('_nom_article":"',reponse[i]) + "</h3>";
                if(reponse[i].includes('_contact_annonceurr":"'))
                    div.innerHTML += "<h3>Contact annonceur : "+ FindPostTag('_contact_annonceurr":"',reponse[i])+"</h3>";

                if(reponse[i].includes('_description":"'))
                    div.innerHTML += "<p>" + FindPostTag('_description":"',reponse[i]) + "</p>";
                mainDiv.appendChild(div);


            }

        }
    };

    xmlhttp.open("GET", url, true);
    xmlhttp.send();

    addCurrentUserCipToDatabase();
}

//cherche le contenu qui suit un tag (ex: titre:, prix:, ...) a l'interieur d'une string de texte (input)
function FindPostTag(tag,input)
{
    var position =  input.indexOf(tag)
    position += tag.length;
    var result = "";
    var currentChar = input.charAt(position);

    while(currentChar!='\"') //tant que le caractere n'est pas un " (qui indique la fin de l'info qu'on recherche)
    {
        result+=currentChar;
        position++;
        currentChar = input.charAt(position);
    }

    if(tag.includes("prix"))
    {
        result = result.slice(0, result.length - 1); //enleve la virgule presente apres le prix
        result += "$";

        if(result.charAt(result.indexOf("$")-2)==".") { //rajoute un 0 a la fin du prix pour eviter d'avoir qqch comme 20.0$
            result = result.slice(0, result.length - 1);
            result += "0$";
        }
    }
    return result;
}

function addCurrentUserCipToDatabase()
{
    var xmlhttp = new XMLHttpRequest();
    var url = "api/student"
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}
