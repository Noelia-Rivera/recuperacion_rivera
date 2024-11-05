package pe.com.coches.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "coche")
public class Coche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_coche")
	private Long id_coche;
	@Column(name = "matricula", length = 10)
	private String matricula;
	@Column(name = "num_puertas")
	private int num_puertas;
	
	@ManyToOne
	@JoinColumn(name = "id_marca", nullable = false)
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo", nullable = false)
	private Tipocoche tipo;
}
