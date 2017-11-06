package dao;

public class Dao_Usuario {

	// Singleton
	public static Dao_Usuario _Instancia;
	private Dao_Usuario() {};
	public static Dao_Usuario Instancia() {
		if(_Instancia==null) {
			_Instancia = new Dao_Usuario();
		}
		return _Instancia;
	}
	//end Singleton
	

	
}
