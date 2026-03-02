using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TokenRefreshForm
    {
        public string? RefreshToken { get; set; }
    }
}
