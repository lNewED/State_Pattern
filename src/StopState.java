// Concrete State
class StopState implements State {
    public void doAction() {
        System.out.println("Stop State");
    }

	@Override
	public void doAction2() {
		// TODO Auto-generated method stub
		 System.out.println("i am sick");
	}
}