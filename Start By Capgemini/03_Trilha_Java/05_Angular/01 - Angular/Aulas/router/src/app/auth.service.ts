import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private tokenKey = 'access_token';

  estaAutenticado(): boolean {
    return !!sessionStorage.getItem(this.tokenKey);
  }

  login(email: string, senha: string): boolean {
    if (email === 'admin@admin.com' && senha === '123456') {
      sessionStorage.setItem(this.tokenKey, 'TOKEN_SIMULADO');
      return true;
    }
    return false;
  }

  logout(): void {
    sessionStorage.removeItem(this.tokenKey);
  }
}
