function main()
{


    var formParameter = document.getElementById("formParameter").value;
    var xmlhttp = new XMLHttpRequest();
    var url = "api/annonce?id=" + formParameter;
    var stringTest = "tempo tempo";

    xmlhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var myArr = JSON.parse(this.response);
            document.getElementById("main").innerHTML = this.response;

            var reponse = this.response.split("{");

            document.getElementById("annonce1").innerHTML = reponse[1];
            document.getElementById("annonce2").innerHTML = reponse[2];
            document.getElementById("annonce3").innerHTML = reponse[3];

            var mainDiv = document.getElementById("divMain");

            var i;
            for(i = 1;i < 10; i++) {     //il faut utiliser createElement a l'interieur du for sinon on deplace l'element plutot que d'en creer un nouveau
                var p2 = document.createElement('p');
                mainDiv.appendChild(p2);

                var div = document.createElement('div');
                div.className = "Annonce";
                div.style = "height:60px";
                div.innerHTML = reponse[i];
                mainDiv.appendChild(div);
            }

        }
    };

    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}