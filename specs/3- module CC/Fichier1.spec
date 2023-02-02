Dernier contrôle
=====================
Created by bvo on 25/01/2023

Description de la relation contrôle dossier

Dernier contrôle
----------------


Un dossier a un contrôle qui est noté comme le dernier

S'il n'y a pas de contrôle, il n'y a pas de dernier
* Etant donné un dossier de référence "12345"
qui n'a pas de contrôle
* alors il n'y a pas de dernier contrôle

S'il n'y a  qu'un contrôle, c'est lui le dernier
* Etant donné un dossier de référence "12345"
* qui possède le contrôle "01/01/2023"
* alors le dernier contrôle de ce dossier est celui à la date "01/01/2023"


S'il n'y a plusieurs contrôles, c'est celui avec la date la plus grande qui est le dernier
* Etant donné un dossier de référence "12345"
* qui possède le contrôle "01/01/2023"
* qui possède le contrôle "02/01/2023"
* qui possède le contrôle "03/01/2023"
* qui possède le contrôle "04/01/2023"
* alors le dernier contrôle de ce dossier est celui à la date "04/01/2023"



Statut
----------------

* Le statut initial est "CREATED"
