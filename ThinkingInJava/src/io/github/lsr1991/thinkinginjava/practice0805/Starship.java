package io.github.lsr1991.thinkinginjava.practice0805;

import static io.github.lsr1991.util.Print.*;

public class Starship {
	private AlertStatus alertStatus;

	public Starship() {
		alertStatus = new InfoStatus("well");
	}

	public void info() {
		if (!(alertStatus instanceof InfoStatus)) {
			alertStatus = new InfoStatus("change to info status");
			println(alertStatus);
		}
	}
	
	public void warn() {
		if (!(alertStatus instanceof WarnStatus)) {
			alertStatus = new WarnStatus("change to warn status");
			println(alertStatus);
		}
	}
	
	public void severe() {
		if (!(alertStatus instanceof SevereStatus)) {
			alertStatus = new SevereStatus("change to severe status");
			println(alertStatus);
		}
	}
	
	public AlertStatus getAlertStatus() {
		return alertStatus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Starship ship = new Starship();
		println(ship.getAlertStatus());
		ship.severe();
		ship.getAlertStatus().setStatus("will sink down!");
		println(ship.getAlertStatus());
	}

}

class AlertStatus {
	private String status;

	public AlertStatus(String status) {
		this.status = status;
	}

	String getStatus() {
		return status;
	}
	
	@Override
	public String toString() {
		return getStatus();
	}
	
	void setStatus(String stat) {
		status = stat;
	}
}

class SevereStatus extends AlertStatus {
	private String status;

	public SevereStatus(String status) {
		super(status);
		this.status = status;
	}

	String getStatus() {
		return status;
	}
	
	void setStatus(String stat) {
		status = stat;
	}
}

class WarnStatus extends AlertStatus {
	private String status;

	public WarnStatus(String status) {
		super(status);
		this.status = status;
	}

	String getStatus() {
		return status;
	}
	
	void setStatus(String stat) {
		status = stat;
	}
}

class InfoStatus extends AlertStatus {
	private String status;

	public InfoStatus(String status) {
		super(status);
		this.status = status;
	}

	String getStatus() {
		return status;
	}
	
	void setStatus(String stat) {
		status = stat;
	}
}