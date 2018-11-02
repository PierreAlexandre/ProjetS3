function main()
{


    var formParameter = document.getElementById("formParameter").value;
    var xmlhttp = new XMLHttpRequest();
    var url = "api/annonce_start?id=1" + formParameter;

    xmlhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var myArr = JSON.parse(this.response);
            document.getElementById("main").innerHTML = this.response;

            var reponse = this.response.split("{");

            var mainDiv = document.getElementById("divMain");

            var i;
            for(i = 1;i < reponse.length; i++) {     //il faut utiliser createElement a l'interieur du for sinon on deplace l'element plutot que d'en creer un nouveau
                var p2 = document.createElement('p');
                mainDiv.appendChild(p2);

                var div = document.createElement('div');
                div.className = "Annonce";
                div.style = "height:180px";
                div.innerHTML += "<div>\n" +
                    "    <p style=\"float: left;\"><img src=\"http://placekitten.com/g/200/200\" height=\"120px\" width=\"120px\" border=\"1px\"></p>\n";
                div.innerHTML += "<h2>" +FindPostTag("_nom_article\":\"",reponse[i]) + " - " + FindPostTag(",\"_prix\":",reponse[i]) + "</h2>";
                div.innerHTML += "<h3>Publié par : "+ FindPostTag("_contact_annonceurr\":\"",reponse[i])+"</h3>";

                div.innerHTML += "<p>" + FindPostTag("_description\":\"",reponse[i]) + "</p>";


                mainDiv.appendChild(div);
            }

        }
    };

    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}
function FindPostTag(tag,input)
{
    var position =  input.indexOf(tag)
    position += tag.length;
    var result = "";
    var currentChar = input.charAt(position);

    while(currentChar!='\"')
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

function add()
{

}
