function main()
{


    var formParameter = document.getElementById("formParameter").value;
    var xmlhttp = new XMLHttpRequest();
    var url = "api/annonce_start?id=1" + formParameter;
    var stringTest = "tempo tempo";

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
                div.style = "height:160px";
                div.innerHTML += "<div>\n" +
                    "    <p style=\"float: left;\"><img src=\"http://placekitten.com/g/200/200\" height=\"120px\" width=\"120px\" border=\"1px\"></p>\n";
                div.innerHTML += "<h2>" +FindPostTitle(reponse[i]) + "</h2>";
                div.innerHTML +="<p>"+ reponse[i] +"</p></div>";


                mainDiv.appendChild(div);
            }

        }
    };

    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}function FindPostTitle(input)
{
    var position =  input.indexOf("_nom_article")
    position += 15;
    var postTitle = "";
    var currentChar = input.charAt(position);

    while(currentChar!='\"')
    {
        postTitle+=currentChar;
        position++;
        currentChar = input.charAt(position);
    }

    return postTitle;

}