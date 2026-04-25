import { useState } from 'react';

export default function PatientForm() {
  const [patientName, setPatientName] = useState('');
  const [email, setEmail] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

   
    if (!patientName.trim() || !email.trim()) {
      console.log('Form submission prevented: Both fields are required');
      return;
    }

    console.log('Form submitted successfully!');
    console.log('Patient Name:', patientName);
    console.log('Email:', email);

    setPatientName('');
    setEmail('');
  };

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label htmlFor="patientName">Patient Name: </label>
        <input
          type="text"
          id="patientName"
          value={patientName}
          onChange={(e) => setPatientName(e.target.value)}
          placeholder="Enter patient name"
        />
      </div>

      <div>
        <label htmlFor="email">Email: </label>
        <input
          type="email"
          id="email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          placeholder="Enter email address"
        />
      </div>

      <button type="submit">Submit</button>
    </form>
  );
}
