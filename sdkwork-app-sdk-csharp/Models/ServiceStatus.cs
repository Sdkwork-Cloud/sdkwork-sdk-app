using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ServiceStatus
    {
        public string? Api { get; set; }
        public string? Database { get; set; }
        public string? Cache { get; set; }
        public string? Storage { get; set; }
        public string? ThirdParty { get; set; }
    }
}
