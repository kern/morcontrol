package com.bhrobotics.morcontrol.devices;

import java.util.Enumeration;

import com.bhrobotics.morcontrol.devices.input.DigitalInput;
import com.bhrobotics.morcontrol.devices.input.RobotDigitalInput;
import com.bhrobotics.morcontrol.devices.output.PWM;
import com.bhrobotics.morcontrol.devices.output.Relay;
import com.bhrobotics.morcontrol.devices.output.RobotPWM;
import com.bhrobotics.morcontrol.devices.output.RobotRelay;
import com.bhrobotics.morcontrol.util.collections.HashMap;
import com.bhrobotics.morcontrol.util.collections.Map;
import com.bhrobotics.morcontrol.util.logger.Logger;

import edu.wpi.first.wpilibj.communication.ModulePresence;

public class DigitalModules {
	private static final Logger logger = Logger.defaultLogger;
	private static final int MAX_MODULES = 2;
	private static final int DIGITAL_INPUTS = 14;
	private static final int MOTORS = 10;
	private static final int RELAYS = 8;

	private static DigitalModules instance;

	private final Map digitalInputs = new HashMap();
	private final Map motors = new HashMap();
	private final Map relays = new HashMap();

	public static DigitalModules getInstance() {
		if (instance == null) {
			instance = new DigitalModules();
		}

		return instance;
	}

	private DigitalModules() {
		for (int i = 0; i < MAX_MODULES; i++) {
			if (ModulePresence.getModulePresence(ModulePresence.ModuleType.kDigital, i)) {
				initializeDigitalInputs(i + 1);
				initializeMotors(i + 1);
				initializeRelays(i + 1);
				logger.info("Initialized digital module " + (i + 1) + ".");
			}
		}
	}

	public DigitalInput getDigitalInput(Address address) {
		return (DigitalInput) digitalInputs.fetch(address);
	}

<<<<<<< HEAD
	public Motor getMotor(Address address) {
		return (Motor) motors.fetch(address);
	}
=======
    public PWM getMotor(Address address) {
	return (PWM) motors.fetch(address);
    }
>>>>>>> 201926b7b68408bce9e3b7c282d1fb3eb55b68c9

	public Relay getRelay(Address address) {
		return (Relay) relays.fetch(address);
	}

	public Enumeration digitalInputs() {
		return digitalInputs.values();
	}

	public Enumeration motors() {
		return motors.values();
	}

	public Enumeration relays() {
		return relays.values();
	}

    private void initializeDigitalInputs(int module) {
	for (int channel = 1; channel <= DIGITAL_INPUTS; channel++) {
	    Address address = new Address(module, channel);
	    DigitalInput device = new RobotDigitalInput(address);
	    digitalInputs.put(address, device);
	}

    private void initializeMotors(int module) {
	for (int channel = 1; channel <= MOTORS; channel++) {
	    Address address = new Address(module, channel);
	    PWM device = new RobotPWM(address);
	    motors.put(address, device);
	}

	private void initializeRelays(int module) {
		for (int channel = 1; channel <= RELAYS; channel++) {
			Address address = new Address(module, channel);
			Relay device = new Relay(address);
			relays.put(address, device);
		}
	}
}