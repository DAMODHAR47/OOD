package problem3;

interface Factory{
	Connection createCon();
	Transaction createTran();
	Command createCmd();
}
class SqlFactory implements Factory{
  Connection createCon(){
      return new SqlConnection();
  }
  Transaction createTran(){
      return new OraTransaction();
  }
  Command createCmd(){
       return new OraCommand();
  }
}
class OraFactory implements Factory{
  Connection createCon(){
      return new OraConnection();
  }
  Transaction createTran(){
      return new OraTransaction();
  }
  Command createCmd(){
       return new OraCommand();
  }
}
public class Entry {
	public static void main() {
		DoJob(new SqlFactory());
	}
	void DoJob(Factory f)
	{
		Connection connection = f.createCon();
		connection.open("mydb;scott;tiger");
		Transaction transaction = f.createTran();
		transaction.begin(connection);
		
		Command cmd1 = f.createCmd();
		cmd1.execute(transaction, "insert into emp values(10,'jack',2500')");

		Command cmd2 =  f.createCmd();
		cmd2.execute(transaction, "insert into emp values(20,'jill',4300')");
		
		transaction.commit();
		
		Transaction transaction2 = f.createTran();
		transaction2.begin(connection);
		
		Command cmd3 = f.createCmd();
		cmd3.execute(transaction, "insert into emp values(10,'jack',2500')");

		transaction2.commit();
		connection.close();
		
	}
}

Interface + DI
