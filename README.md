# FixCaisse
Application mobile développée en kotlin pour lui suivi d'entretien numérique auto/moto
Voici une explication de la structure de base de l'application :

MainActivity: C'est le point d'entrée de l'application. Elle gère la navigation entre les différents fragments

Vehicle et MaintenanceRecord: Ce sont les classes de données principales pour stocker les informations sur les véhicules et les enregistrements d'entretien

VehicleDao et MaintenanceRecordDao: Ces interfaces définissent les opérations de base de données pour les véhicules et les enregistrements d'entretien

AppDatabase: C'est la classe principale de la base de données Room

VehicleListFragment, AddMaintenanceFragment, et ReportsFragment: Ce sont les fragments principaux pour afficher la liste des véhicules, ajouter des enregistrements d'entretien et générer des rapports
