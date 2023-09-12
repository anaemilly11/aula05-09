package br.com.etechoracio.pw2Jpa.enums;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum TipoEquipamento{

    Computador,
    Celular,
    Video_Game,
    Tablet,
    Notebook;

}
