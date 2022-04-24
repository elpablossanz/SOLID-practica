PRINCIPIO RESPONSABILIDAD ÚNICA
El primer principio que he encontrado es el principio de responsabilidad única, este principio se incumple en la clase File ya que en esta clase tenemos métodos que tienen una funcionabilidad común como open(), read(), write(), y otros métodos que no deberían estar en la clase File como convertWavToMp3() o convertMp3ToWav() ya que son ficheros de sonido, para solucionar este principio he creado una nueva clase llamada FileSound en la que tendremos esta funcionalidad propia de sonido.
PRINCIPIO ABIERTO/CERRADO
En la clase FileSystemItemBasic existen variables protected como PATH_SEPARATOR con un valor de /, esto es un error no hacerlo privado porque se podría cambiar ese separador en las clases hijas ya que es protected, para solucionarlo he puesto esta variable private para que no se pueda modificar.
PRINCIPIO DE SUSTITUCIÓN DE LISKOV
La subclase no puede lanzar excepciones que no lance su antecesora, esto lo incumple ya que en las clases File, Directory hay métodos que no son utilizados y estos mandan un excepción ya que ese tipo de métodos no se pueden hacer en esa clase concretamente, la solución a esto es que file y directory implementen sus propias interfaces con los métodos que necesiten y no tener en las interfaces métodos que no utilicen sus clases implementadas.
PRINCIPIO DE SEGREGACIÓN DE INTERFACES
En el programa existe una interfaz llamada FileSystemItem en la cual tiene muchos métodos, hay algunos métodos que no se usan como setPosition(), las clases File y Directory no deberían de verse obligados a implementar esta interfaz ya que hay métodos que no van a utilizar, para solucionar esto hay que crear nuevas interfaces a partir de FileSystemItem.
PRINCIPIO DE INVERSIÓN DE DEPENDENCIAS
En el código inicial todas las clases e interfaces están en el mismo paquete, cuando estas clases e interfaces deberían estar en la clase padre y cada una en sus propios paquetes. Para solucionar esto deberíamos de crear paquetes en los que estén las clases y otro en donde estén las interfaces.



