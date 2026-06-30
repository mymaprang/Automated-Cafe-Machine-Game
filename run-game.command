#!/bin/sh

cd "$(dirname "$0")" || exit 1

if ! command -v java >/dev/null 2>&1; then
  echo "Java is not installed."
  echo "Install a Java JDK 8 or newer, then run this file again."
  read -r -p "Press Enter to close..."
  exit 1
fi

java -cp "bin" ActualGame.TaoBinTesting

status=$?
if [ "$status" -ne 0 ]; then
  echo
  echo "The game did not start. Exit code: $status"
  echo "Make sure you have Java installed and that this file is inside the project folder."
  read -r -p "Press Enter to close..."
fi
