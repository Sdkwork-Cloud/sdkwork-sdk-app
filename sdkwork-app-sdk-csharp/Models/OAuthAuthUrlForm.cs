using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OAuthAuthUrlForm
    {
        public string? Provider { get; set; }
        public string? RedirectUri { get; set; }
        public string? Scope { get; set; }
        public string? State { get; set; }
    }
}
